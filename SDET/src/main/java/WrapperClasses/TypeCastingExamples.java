package WrapperClasses;

public class TypeCastingExamples {

	public static void main(String[] args) {
		
//		byte < short < int < long < float < double		
		
		byte b = 45;
		
		short s = b; 
		int i = b;
		long l = b;
		float f = b;
		double d = b;
				
//Type casting
		double dou = 345d;
		
		float fl = (float) dou;		//convert double to float
		long lo = (long) dou;		//convert double to long
		int in = (int)dou;			//convert double to int
		short sh = (short)dou;		//convert double to short
		byte by = (byte)dou;		//convert double to byte
		
//Wrapper class
		
		Byte bytes = 76;
		
		bytes.intValue();
		bytes.floatValue();
		bytes.longValue();
		bytes.shortValue();
		bytes.doubleValue();
	
		Short shorts = 23;
		
		Integer integer = 199;
		
		Long longs = 67L;
		
		Float floats = 56.0f;
		
		Double doubles = 868d;
		
		doubles.byteValue();
		doubles.shortValue();
		doubles.intValue();
		doubles.longValue();
		doubles.floatValue();
		doubles.doubleValue();
		
//String 
		
		String str = "5643";
				
		Short.parseShort(str);
		//Byte.parseByte(str);
		Integer.parseInt(str);
		Long.parseLong(str);
		Float.parseFloat(str);
		Double.parseDouble(str);

//Actual String will throw the number format exception in below code
		/*
		 * String se = "Hi";
		 * 
		 * Short.parseShort(se); Byte.parseByte(se); Integer.parseInt(se);
		 * System.out.println(Short.parseShort(se));
		 * System.out.println(Byte.parseByte(se));
		 */
		
	
				
	}

}
