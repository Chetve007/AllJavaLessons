package homework7_1;
import java.util.Arrays;

public class DynMassive {
	/*
	if you see something unreadable, switch encoding to UTF-8
	������� ����� ������� �������� ��� ������������ ������
	�������� add ������ ��������� � ������ ��������
	length - ���������� ������ ������� (�������� ���� 6 ��� ������� �������� add - length() ������ ������� 6
	print - ������ �������
	toArray - ���������� ������� ������ java
	*/
		public static void main(String[] args) {
			CreateDM array = new CreateDM();
			
			//��������� �������� � ������
			array.add(1);
			array.add(121);
			array.add(1);
			array.add(121);
			array.add(1);
			array.add(121);
			
			System.out.println(array.length()); // 6
			array.print(); // 1, 121, 1, 121, 1, 121
			int[] javaArray = array.toArray();
			// ������� ���� ����� ��� � array.print()
			System.out.println(Arrays.toString(javaArray));
		}
}
