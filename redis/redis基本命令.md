Redis
======

REmote DIctionary Server(Redis) 是一个由 Salvatore Sanfilippo 写的 key-value 存储系统，是跨平台的非关系型数据库。

Redis 是一个开源的使用 ANSI C 语言编写、遵守 BSD 协议、支持网络、可基于内存、分布式、可选持久性的键值对(Key-Value)存储数据库，并提供多种语言的 API。

Redis 通常被称为数据结构服务器，因为值（value）可以是字符串(String)、哈希(Hash)、列表(list)、集合(sets)和有序集合(sorted sets)等类型。  

## Redis 字符串(String)

### 1.SET key value
设置一个键值对

### 1.GET key
获取一个键值对，不存在返回null

### 3.DEL key
该命令用于在 key 存在时删除 key。

### 4.GETRANGE key start end
用于获取存储在指定 key 中字符串的子字符串。字符串的截取范围由 start 和 end 两个偏移量决定(包括 start 和 end 在内)。
> -> SET mykey "123456"  
> -> GETRANGE mykey 0 3  
> -> 1234  


### 5.GETSET key
用于设置指定 key 的值，并返回 key 的旧值。

### 6.MGET key1 key2 ....
返回所有(一个或多个)给定 key 的值。 如果给定的 key 里面，有某个 key 不存在，那么这个 key 返回特殊值 nil     

### 7.SETEX key timeout value
为指定的 key 设置值及其过期时间。如果 key 已经存在， SETEX 命令将会替换旧的值  

### 8.SETNX key value
在指定的 key 不存在时，为 key 设置指定的值。
设置成功，返回 1 。 设置失败，返回 0 。

### 9.INCR key
将 key 中储存的数字值增一。

### 10.INCRBY key increment
将 key 所储存的值加上给定的增量值（increment） 。

### 11.DECR key
将 key 中储存的数字值减一。

### 12.DECRBY key decrement
key 所储存的值减去给定的减量值（decrement） 。

### 13.APPEND key value
如果 key 已经存在并且是一个字符串， APPEND 命令将指定的 value 追加到该 key 原来值（value）的末尾。

## Redis 哈希(Hash)
Redis hash 是一个 string 类型的 field（字段） 和 value（值） 的映射表，hash 特别适合用于存储对象。

Redis 中每个 hash 可以存储 232 - 1 键值对（40多亿）。


### HMDEL key field1 field2 ...
删除一个或多个哈希表字段

### HMSET key field1 field2 ...
设置一个或多个哈希表字段

### HGETALL key
获取在哈希表中指定 key 的所有字段和值

### HGET key field
获取存储在哈希表中指定字段的值。

### HKEYS key
获取所有哈希表中的字段

### HVALS key
获取哈希表中所有值

### HSETNX key field value
只有在字段 field 不存在时，设置哈希表字段的值

## Redis 列表(List)
Redis列表是简单的字符串列表，按照插入顺序排序。你可以添加一个元素到列表的头部（左边）或者尾部（右边）  

### LPUSH key value1 value2...
将一个或多个值插入到列表头部

### LRANGE key start stop
获取列表指定范围内的元素

### LINDEX key index
通过索引获取列表中的元素

### LPOP key
移出并获取列表的第一个元素  

###	LSET key index value
通过索引设置列表元素的值  

###	RPOP key
移除列表的最后一个元素，返回值为移除的元素。  

## Redis 集合(Set)
Redis 的 Set 是 String 类型的无序集合。集合成员是唯一的，这就意味着集合中不能出现重复的数据。   
Redis 中集合是通过哈希表实现的，所以添加，删除，查找的复杂度都是 O(1)。  

### SADD key member1 ...
向集合添加一个或多个成员    

### SCARD key
获取集合的成员数

### SDIFF key1 key2
返回第一个集合与其他集合之间的差异

### SDIFFSTORE destination key1 key2
返回给定所有集合的差集并存储在 destination 中

### SISMEMBER key member
判断 member 元素是否是集合 key 的成员

### SMEMBERS key
返回集合中的所有成员

### SPOP key
移除并返回集合中的一个随机元素  

### SUNION key1 key2
返回所有给定集合的并集  

## Redis 有序集合(sorted set)
Redis 有序集合和集合一样也是 string 类型元素的集合,且不允许重复的成员。

不同的是每个元素都会关联一个 double 类型的分数。redis 正是通过分数来为集合中的成员进行从小到大的排序。

有序集合的成员是唯一的,但分数(score)却可以重复。

集合是通过哈希表实现的，所以添加，删除，查找的复杂度都是 O(1)。 集合中最大的成员数为 232 - 1 (4294967295, 每个集合可存储40多亿个成员)。  

### ZADD key score1 member1 score2 member2...
向有序集合添加一个或多个成员，或者更新已存在成员的分数  

### ZCARD key
获取有序集合的成员数

### ZCOUNT key min max
计算在有序集合中指定区间分数的成员数  

### ZINCRBY key increment member
有序集合中对指定成员的分数加上增量 increment  

### ZRANGE key start stop WITHSCORES
通过索引区间返回有序集合指定区间内的成员  

### ZRANK key member
返回有序集合中指定成员的索引

### ZSCORE key member
返回有序集中，成员的分数值