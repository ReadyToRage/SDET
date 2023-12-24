package WrapperClasses;

public class Integer_Example {

	public static void main(String[] args) {

		//Integer		
		Integer num = 123;
		
		num.intValue();
		num.byteValue();
		num.doubleValue();
		num.longValue();
		num.shortValue();
		
		num.compareTo(num);
		num.equals(num);
		
		num.toString();
		
		Integer.toBinaryString(0);
		Integer.toHexString(0);
		Integer.toOctalString(0);
		Integer.toString(0);
		Integer.toString(0, 0);
		Integer.toUnsignedLong(0);
		Integer.toUnsignedString(0, 0);
		
		Integer.getInteger(null);
		Integer.getInteger(null, 0);
		Integer.getInteger(null, num);
		
		Integer.compress(0, 0);
		Integer.bitCount(0);
		
		Integer.highestOneBit(0);
		Integer.lowestOneBit(0);
		
		
	}

}