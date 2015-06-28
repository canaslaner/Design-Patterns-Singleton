This is singleton design pattern basic example. You will find two example in this repo. First is thread safe singleton, second is not.  

***

output of tests are :

    synchronizedTest Started...
    Thread 2 instance is : com.caslaner.designpatterns.singleton.service.CacheSynchronized@53a816e5
    Thread 1 instance is : com.caslaner.designpatterns.singleton.service.CacheSynchronized@53a816e5
    unSynchronizedTest Started...
    Thread 2 instance is : com.caslaner.designpatterns.singleton.service.CacheUnSynchronized@35cfee57
    Thread 1 instance is : com.caslaner.designpatterns.singleton.service.CacheUnSynchronized@2364e850

***
As seen above in synchronized test the two instance have the same address is 53a816e5, but in unsynchronized test the two instance have different addresses are 35cfee57 and 2364e850.
