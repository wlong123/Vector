/**
	Vector class that is very similar to an array but its size is dynamic
	@version 10/19/15
	@author Will Long
*/
public class Vector<E>
{
	private Object[] data;
	private int capacity;
	//size of data
	private int size;
	//number of objects currently being used in data
	
	/**
	default constructor
	*/
	public Vector()
	{
		this(10);
	}
	
	/**
	constructor that takes in an int initCapacity
	@param initCapacity initial capacity of data
	*/
	public Vector(int initCapacity)
	{
		if(initCapacity < 0)
			throw new ArrayIndexOutOfBoundsException("index is below zero or greater than the size of the array");
		data = new Object[initCapacity];
		capacity = initCapacity;
		size = 0;
	}
	
	/**
	constructor that takes in another Vector<E> and copies that vector's data 
	@param other Vector that is to be copied 
	*/
	public Vector(Vector<E> other)
	{
		data = new Object[other.size()];
		for(int i = 0; i < other.size(); i++)
		{
			data[i] = other.get(i);
		}
		capacity = data.length;
		size = other.size();
	}
	
	/**
	adds a values to the end of data
	@param toAdd value to be added to end of data
	*/
	public void add(E toAdd)
	{
		if(size >= capacity)
			increaseCapacity();
		data[size] = toAdd;
		size++;
	}
	
	/**
	adds value to specific spot in data and shifts values to the right down one spot
	@param index spot at which value is to be added
	@param toAdd value that is to be added
	*/
	@SuppressWarnings("unchecked")
	public void add(int index, E toAdd)
	{
		if(size >= capacity)
			increaseCapacity();
		if((index < 0) || (index > size))
			throw new ArrayIndexOutOfBoundsException("index is below zero or greater than the size of the array"); 
		size++;
		for(int i = index; i < size; i++)
		{
			E temp = (E) data[i];
			data[i] = toAdd;
			toAdd = temp;
		}
	}
	
	/**
	returns a string representation of the vector
	@return String representation of the vector
	*/
	public String toString()
	{
		String s = "";
		for(int i = 0; i < size; i++)
		{
			s += "[" + data[i] + "]" + " ";
		}
		return s;
	}
	
	/**
	doubles the size of data. only called in add function if size is greater than or equal to capacity
	*/
	private void increaseCapacity() 
	{
		Object[] temp = data;
		data = new Object[capacity * 2];
		for(int i = 0; i < temp.length; i++)
		{
			data[i] = temp[i];
		}
	}
	
	/**
	returns value at inputted index of data
	@param index spot of data whose value is to be returned
	@return E value at spot index of data
	*/
	@SuppressWarnings("unchecked")
	public E get(int index)
	{
		if((index > size) || (index < 0))
			throw new ArrayIndexOutOfBoundsException("index is below zero or greater than the size of the array");
		return (E) data[index];
	}
	
	/**
	returns the variable size
	@return int number of values in data
	*/
	public int size()
	{
		return size;
	}

	/**
	removes and returns item at a specified index. shifts other items down
	@param index spot of item that is going to be removed
	@return E item that was removed
	*/
	@SuppressWarnings("unchecked")
	public E remove(int index)
	{
		if((index < 0) || (index > size))
			throw new ArrayIndexOutOfBoundsException("index is below zero or greater than the size of the array");
		E output = (E) data[index];
		for(int i = index; i < size - 1; i++)
		{
			data[i] = data[i + 1];
		}
		size--;
		return output;
	}
	
	/**
	remove first instance of specified object
	@param obj object to be removed
	@return boolean true if object was removed and false is object not in vector
	*/
	public boolean remove(E obj)
	{
		if(contains(obj) == false)
			return false;
		int i = indexOf(obj);
		remove(i);
		return true;
	}
	
	/**
	places objects at specified location
	@param index spot at which object is to be placed
	@param obj object that is to be placed
	@return E object that was previously at that spot
	*/
	@SuppressWarnings("unchecked")
	public E set(int index, E obj)
	{
		//throw exception if index is greater than size
		E output = (E) data[index];
		data[index] = obj;
		return output;
	}
	
	/**
	removes all items from the vector
	*/
	public void clear()
	{
		data = new Object[capacity];
		size = 0;
	}
	
	/**
	returns whether or not the vector is empty
	@return boolean returns true is vector is empty and false if not
	*/
	public boolean isEmpty()
	{
		if(size == 0)
			return true;
		return false;
	}
	
	/**
	returns whether or not the vector contains a specified object
	@param obj checks whether obj is in vector
	@return boolean returns true if obj is in the vector, false if not
	*/
	public boolean contains(E obj)
	{
		//call indexOf 
		if(indexOf(obj) >= 0)
			return true;
		return false;
	}
	
	/**
	returns index of first instance of specified object
	@param obj object whose index is returned
	@return int index of obj
	*/
	@SuppressWarnings("unchecked")
	public int indexOf(E obj)
	{
		for(int i = 0; i < size; i++)
		{
			if(obj.equals((E) data[i]))
				return i;
		}
		return -1;
	}
}