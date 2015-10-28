public class VectorRunner
{
	public static void main(String [] args)
	{
		Vector<Integer> a = new Vector<Integer>();
		a.add(5);
		a.add(4);
		a.add(3);
		a.add(2);
		a.add(1);
		a.remove(1);
		System.out.println(a);
		Vector<String> v = new Vector<String>();
		v.add("w");
		v.add("i");
		v.add("l");
		v.add("l");
		v.add("w");
		v.add("i");
		v.add("l");
		v.add("l");
		v.add("w");
		v.add("i");
		v.add("l");
		v.add("l");
		for(String s : v)
			System.out.println(s);
		System.out.println(v);
		VectorIterator<String> i = new VectorIterator<String>(v);
		System.out.println(i.hasNext());
		//for(int x = 0;x < 100; x++)
		//{
			//System.out.println(i.next());
		//}
		v.remove(0);
		System.out.println(v.set(0,"x"));
		System.out.println(v.indexOf("w"));
		System.out.println(v.remove("w"));
		System.out.println(v.remove("r"));
		System.out.println(v);
		Vector<String> v1 = new Vector<String>(10);
		v1.add(0,"l");
		v1.add(0,"l");
		v1.add(0,"i");
		v1.add(0,"w");
		v1.add(3,"s");
		v1.add(0,"l");
		v1.add(0,"l");
		v1.add(0,"i");
		v1.add(0,"w");
		v1.add(3,"s");
		v1.add(0,"l");
		v1.add(0,"l");
		v1.add(0,"i");
		v1.add(0,"w");
		v1.add(3,"s");
		v1.add(0,null);
		v1.add(0,null);
		//System.out.println(v1.get(v1.size()));
		System.out.println(v1);
		System.out.println(v1.get(0));
		System.out.println(v1.indexOf(null));
		System.out.println(v1.remove(0));
		System.out.println(v1.remove(null));
		System.out.println("v1: " + v1);
		v1.remove(new Integer(5));
		System.out.println("v1: " + v1);
		v1.clear();
		System.out.println(v1);
		Vector<String> v2 = new Vector<String>(v);
		Vector<String> v3 = new Vector<String>(10);
		//Vector<String> v4 = new Vector<String>(v3);
		v2.add("w");
		System.out.println(v2);
		//v2.add(-1,"s");
		//v2.add(100, "s");
		//v2.get(-2);
		//v2.get(100);
		//v2.remove(100);
		//v2.remove(-3);
		v2.set(-4, "s");
		v2.set(100, "s");
		System.out.println(v2);
		
	}
}