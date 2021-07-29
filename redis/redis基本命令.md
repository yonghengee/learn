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
