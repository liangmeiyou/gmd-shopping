package com.springcloud.common;

import java.util.Date;

/**
 *�ļ��ϴ��Ĺ�����
 * @author lmy
 *
 */
public class UploadUtils {
	/**
	 * ������ļ����ƣ�������+4λ�������
	 * @return �����µ��ļ�����
	 */
	public static String getFileName() {
		String fileName = null;
		
		//���1-1000�������
		int num = (int)(Math.random()*1000 +1);
		
		//�����������Ϊ4λ
		String tempNum = "000" + num;
		tempNum = tempNum.substring(tempNum.length() - 4);
		
		Date date = new Date();
		fileName = date.getTime() + tempNum;
		
		return fileName;
	}
	public static String getExendedName(String fileName) {
		if(fileName == null || fileName.length() == 0) {
			return null;
		}
		//����ļ����У����һ�γ��ֵ�λ��
		int index = fileName.lastIndexOf(".");
		if(index == -1) {
			return null;
		}
		return fileName.substring(index);
	}
//	public static void main(String[] args) {
//		System.out.println(getExendedName("abcd.efg.jpg"));
//	}
}
