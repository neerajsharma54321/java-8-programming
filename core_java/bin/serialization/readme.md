Serialization:

OOS : Object output stream
FOS : File output stream

Deserialization: 

OIS : Object input stream
FIS : File input stream

OOS: Convert data into binary stream
FOS: Write binary stream data into a file

Serialization -> OOS -> object of OOS.writeObject() -> FileOutputStream
It is the process of converting an object from java supported form to an File/Network supported form is called Serialization.
Using FOS and OOS we can implement serialization. 

Deserialization-> FIS -> OIS -> object of OIS.readObject()
It is the process of converting an object from File/Network supported form to Java Supported form is called Deserialization.
Using FIS and OIS we can implement Deserialization. 


 