/**
*@author Emily Sanchez
*@version 1.0
*Data structure vector that manages an array and has a dynamic size
*/

public class Vector<E>
{
  //how many items the vector can hold
  private int capacity;
  //storage array
  private Object [] data;
  //how many items in the vector
  private int size;

  public Vector()
  {
    capacity = 20;
    data = new Object [capacity];
    size = 10;
  }

  public Vector (int initCapacity)
  {

    capacity = initCapacity;
    data = new Obejct [capacity];
    size = 10;
  }

  public Vector(Vector<E> other)
  {
    data = new Object[other.length];
    for (int i=0; i<other.length; i++)
    {
      data[i] = other[i]
    }
    capacity = other.capacity;
    size = other.size;
  }

  public void add(E toAdd)
  {
    Vector<E> v = new Vector<E>(size+1);
    v.data[size+1] = toAdd;
  }

  public void add(int index, E toAdd)
  {
    Vector<E> v = new Vector<E>();
    v.data[index] = toAdd;
  }

  public void increaseCapacity()
  {
    capacity *= 2;
  }
}
