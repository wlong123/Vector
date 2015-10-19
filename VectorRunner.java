public class VectorRunner
{
	public static void main(String [] args)
	{
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
		System.out.println(v);
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
		System.out.println(v1);
		Vector<String> v2 = new Vector<String>(v);
		v2.add("w");
		System.out.println(v2);
		v2.add(100,"s");
		System.out.println(v2);
	}
}