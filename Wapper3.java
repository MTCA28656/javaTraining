class Wapper3
{
	public static void main(String[] args) 
	{
			byte b=10;
			short s=20;
			int i=30;
			long  l=40;
			float f=50.0f;
			double d=60.0;
			boolean b1=true;
			//Autoboxing
			Byte bobj=b;
			Short sobj=s;
			Integer iobj=i;
			Long lobj=l;
			Float fobj=f;
			Double dobj=d;
			Boolean b1obj=b1;
			//printing objects
			System.out.println("---------Object Values-------");
			System.out.println("Byte Object: "+bobj);
			System.out.println("Short Object: "+sobj);
			System.out.println("Int Object: "+iobj);
			System.out.println("Long Object: "+lobj);
			System.out.println("Float Object: "+fobj);
			System.out.println("Double Object: "+dobj);
			System.out.println("Boolean Object: "+b1obj);
			//unboxing
			byte bv=bobj;
			short sv=sobj;
			int iv=iobj;
			long lv=lobj;
			float fv=fobj;
			double dv=dobj;
			boolean b1v=b1obj;
			//printing primitives
			System.out.println("---------Primitive Values-------");
			System.out.println("Byte values: "+bv);
			System.out.println("Short Values: "+sv);
			System.out.println("Int Values: "+iv);
			System.out.println("Long values: "+lv);
			System.out.println("Float values: "+fv);
			System.out.println("Double values: "+dv);
			System.out.println("Boolean values: "+b1v);
	}
}
