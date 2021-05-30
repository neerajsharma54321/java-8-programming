If we are using default method in interface then make sure the below points

interface1{
default void show() {}

// error- the static method can not hide the instance method from Object
static void toString() {		
}
}

interface2 {
	default void show(){
	}
}

// if we will not override the show method then compiler will show the error.
class A implements interface1, interface2{

}