package homework7;
import java.util.ArrayList;
public class DynamMass {
	/*
	if you see something unreadable, switch encoding to UTF-8
	������� ����� ������� �������� ��� ������������ ������
	�������� add ������ ��������� � ������ ��������
	length - ���������� ������ ������� (�������� ���� 6 ��� ������� �������� add - length() ������ ������� 6
	print - ������ �������
	toArray - ���������� ������� ������ java
	*/
	public static void main(String[] args) {
		DArray array = new DArray();
			
		//��������� �������� � ������
		array.add(1);
		array.add(121);
		array.add(1);
		array.add(121);
		array.add(1);
		array.add(121);
//			
		System.out.println(array.length()); // 6
		array.print(); // 1, 121, 1, 121, 1, 121
		System.out.println();
		ArrayList<Integer> javaArray = array.toArray();
		System.out.println();
//		������� ���� ����� ��� � array.print()
		System.out.print(javaArray);
	}
}
