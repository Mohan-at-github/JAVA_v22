package Generics.Intro;

public class ObjectToPrint {
    Object objectToPrint;
    public ObjectToPrint(Object obj)
    {
        this.objectToPrint=obj;
    }
    public void print()
    {
        System.out.println(objectToPrint);
    }

    public Object getObjectToPrint() {
        return objectToPrint;
    }

    public void setObjectToPrint(Object objectToPrint) {
        this.objectToPrint = objectToPrint;
    }
}
