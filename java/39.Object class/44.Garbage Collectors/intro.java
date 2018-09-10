//if object having one refernce varaible then it is live object
//if object doesn't one refernce varaible then it is called as abandoded objects or garbage object
//gc removing all the abandoded objects from the memory
//for any object last reference varaible is removing, that object will become abanded
//whenever object is becoming abandoded it is eligible garbage collection but gc didn't remove that object immediately
//from the memory
//once gc goes to heap memory to check anandoded objects and removing those objects
//we can't except when or at what moment object is removed by garbage collector from the memory as gc comes to heap
//memory once in a while
//before removing the abandoded objects from the memory, gc calls finalize method for clean up purpose
//gc calls finalize before removing every abandoded object(calling finalize method max one time for one object)
//if object is not abandoded, then gc didn't call finalize method
//giving life again is called as resurrection
//abandoded object can become as resurrected object
//if object has reference varaible, then that object is called as live object
//one object can have any reference variables
//recurrected object can become again abonded object
//programatically we can request JVM to call garbage collector
/*there are 2 ways to call gc
			-System.gc();
			-Runtime.getruntime.gc();
			*/
//finalize method is available in object class,then it is available in every class(as every class is subclass to object class)