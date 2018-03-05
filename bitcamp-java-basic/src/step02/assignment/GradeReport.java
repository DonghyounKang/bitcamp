//������������ �ڹ����α׷���, ����ǥ ���
//�̸�, �й�, ���� ������ ���� �Է¹��� �� �Ѳ����� ����ϴ� ���α׷�
//������ : ������
//�ۼ��� : 2016.03.29
package step02.assignment;
import java.util.Scanner; 

public class GradeReport {

	public static void main (String[] args) {
	char gkor, geng, gmath, git, gave;
	Scanner value=new Scanner(System.in);

	System.out.println("�̸��� �Է��ϼ���");
	String name = value.next();

	System.out.println("�й��� �Է��ϼ���");
	String snum=value.next();

	System.out.println("���������� �Է��ϼ���");
	int kor=value.nextInt();
			
			if(kor>=90)
				gkor='A';
			else if(kor>=80)
				gkor='B';
			else if(kor>=70)
				gkor='C';
			else if(kor>=60)
				gkor='D';
			else
				gkor='F';
		
	System.out.println("���������� �Է��ϼ���");
	int eng=value.nextInt();
			if(eng>=90)
				geng='A';
			else if(eng>=80)
				geng='B';
			else if(eng>=70)
				geng='C';
			else if(eng>=60)
				geng='D';
			else
				geng='F';

	System.out.println("���������� �Է��ϼ���");
	int math=value.nextInt();
			if(math>=90)
				gmath='A';
			else if(math>=80)
				gmath='B';
			else if(math>=70)
				gmath='C';
			else if(math>=60)
				gmath='D';
			else
				gmath='F';

	System.out.println("��ǻ�������� �Է��ϼ���");
	int it=value.nextInt();
			if(it>=90)
				git='A';
			else if(it>=80)
				git='B';
			else if(it>=70)
				git='C';
			else if(it>=60)
				git='D';
			else
				git='F';

	float ave =( kor + eng + math + it )/4;
			if(ave>=90)
				gave='A';
			else if(ave>=80)
				gave='B';
			else if(ave>=70)
				gave='C';
			else if(ave>=60)
				gave='D';
			else
				gave='F';


	System.out.println("-------------------------------");
	System.out.println("            ����ǥ");
	System.out.println("-------------------------------");
	System.out.println(" �̸� :"+name+"   �й� :" +snum );
	System.out.println("-------------------------------");
	System.out.println(" �����       ����        ����");
	System.out.println("   ����        "+kor+"           "+gkor);
	System.out.println("   ����        "+eng+"           "+geng);
	System.out.println("   ����        "+math+"           "+gmath);
	System.out.println(" ��ǻ��        "+it+"           "+git);
	System.out.println("-------------------------------");
	System.out.println(" �������      " +ave+"         "+gave);
	System.out.println("-------------------------------");
	}
}

//�ε�~ �ܼ��ܺ����� �ذ��ߴ�. 