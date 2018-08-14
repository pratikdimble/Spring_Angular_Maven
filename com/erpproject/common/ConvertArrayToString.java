package com.erpproject.common;

import java.util.List;

public class ConvertArrayToString
	{
		public static String IntegerArrayToString(Integer[] inputArrayIneger)
			{
				try
					{
						StringBuffer outputArrayString = new StringBuffer("{");
						for (int i = 0; i < inputArrayIneger.length; i++)
							{
								String inpt = inputArrayIneger[i].toString();
								outputArrayString.append(inpt);
								if (i < inputArrayIneger.length - 1)
									{
										outputArrayString.append(",");
									}
							}
						outputArrayString.append("}");
						return new String(outputArrayString);
					}
				catch (Exception e)
					{
						e.printStackTrace();
						return null;
					}
			}

		public static String IntegerArrayToString(Integer[] inputArrayIneger,boolean isBrace)
		{
			try
				{
					StringBuffer outputArrayString = null;
					if(isBrace)
						outputArrayString = new StringBuffer("{");
					else
						outputArrayString = new StringBuffer();
					for (int i = 0; i < inputArrayIneger.length; i++)
						{
							String inpt = inputArrayIneger[i].toString();
							outputArrayString.append(inpt);
							if (i < inputArrayIneger.length - 1)
								{
									outputArrayString.append(",");
								}
						}
					if(isBrace)
						outputArrayString.append("}");
					return new String(outputArrayString);
				}
			catch (Exception e)
				{
					e.printStackTrace();
					return null;
				}
		}
		
		public static String IntegerArrayToString(List<Integer> inputArrayIneger)
			{
				try
					{
						Integer[] array = inputArrayIneger.toArray(new Integer[inputArrayIneger.size()]);
						return IntegerArrayToString(array);
					}
				catch (Exception e)
					{
						e.printStackTrace();
						return null;
					}
				
			}
		
		

		public static void main(String[] args)
			{
				/*
				 * List<Integer> intList = new ArrayList<Integer>();
				 * intList.add(1); intList.add(2); intList.add(3);
				 * intList.add(4);
				 * System.out.println(ConvertArrayToString.IntegerArrayToString(
				 * intList));
				 * 
				 * Integer[] arr = {1,2,3,4};
				 * System.out.println(ConvertArrayToString.IntegerArrayToString(
				 * arr));
				 */
			}
	}
