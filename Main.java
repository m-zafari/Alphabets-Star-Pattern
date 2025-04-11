import java.util.Scanner;

public class Main {


    public static void main(String[] args){
    	System.out.print("Enter type(A, E, F, etc): ");
    	Scanner scanner = new Scanner(System.in);
    	String type = scanner.nextLine().toLowerCase();
    	System.out.print("Enter number of rows(or diameter): ");
    	int n = scanner.nextInt();

		switch(type) {
		case "a":
			A a_obj = new A();
			a_obj.aa(n);
			break;
		case "e":
			E e_obj = new E();
			e_obj.ee(n);
		    break;
		case "f":
			F f_obj = new F();
			f_obj.ff(n);
		    break;
		case "h":
			H h_obj = new H();
			h_obj.hh(n);
		    break;
		case "i":
			I i_obj = new I();
			i_obj.ii(n);
		    break;
		case "k":
			K k_obj = new K();
			k_obj.kk(n);
		    break;
		case "l":
			L l_obj = new L();
			l_obj.ll(n);
		    break;
		case "m":
			M m_obj = new M();
			m_obj.mm(n);
		    break;
		case "n":
			N n_obj = new N();
			n_obj.nn(n);
		    break;
		case "t":
			T t_obj = new T();
			t_obj.tt(n);
		    break;
		case "v":
			V v_obj = new V();
			v_obj.vv(n);
		    break;
		case "w":
			W w_obj = new W();
			w_obj.ww(n);    
		    break;
		case "x":
			X x_obj = new X();
			x_obj.xx(n);
		    break;
		case "y":
			Y y_obj = new Y();
			y_obj.yy(n);
		    break;
		case "z":
			Z z_obj = new Z();
			z_obj.zz(n);
		    break;
		case "c1":
			Circle_Type1 c1_obj = new Circle_Type1();
			c1_obj.c1(n);
			break;
		case "c2":
			Circle_Type2 c2_obj = new Circle_Type2();
			c2_obj.c2(n);
			break;
		case "cd":
			Cardioid_Down cd_obj = new Cardioid_Down();
			cd_obj.cardioid_d(n);
		    break;     
		case "cl":
			Cardioid_Left cl_obj = new Cardioid_Left();
			cl_obj.cardioid_l(n);
		    break;      
		case "cu":
			Cardioid_Up cu_obj = new Cardioid_Up();
			cu_obj.cardioid_u(n);
		    break;
		case "cr":
			Cardioid_Right cr_obj = new Cardioid_Right();
			cr_obj.cardioid_r(n);
		    break;
		    }
		}
    }
