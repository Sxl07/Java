package JavaPrototype.prototype;

public interface IPrototype<T extends IPrototype> extends Cloneable {

    //Simple clone
    public T clone();

    //Deep clone
    public T deepClone();
}