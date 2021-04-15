import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Algoritmalar {
	  public void randomSayi() {
		  int rnd=(int)(Math.random()*1000);
		  System.out.println("üretilen sayý:"+rnd);
		  int birler=rnd%10;
		  rnd=rnd/10;
		  int onlar=rnd%10;
		  int yuzler=rnd/10;
		  System.out.println("Toplamlarý:"+(birler+onlar+yuzler));
	  }
	  public void yizdizUcgen(int sayi) {
		  for (int i = 1; i <= sayi; i++) {
			for (int j = 0; j < i; j++) {
				System.out.println("*");
			}
			System.out.println("");
		}
	  }
	  public void ucgenSayilar(int sayi) {
		  for (int i = sayi; i >=1; i--) {
			
			 for (int j = i; j >=1; j--) {
				System.out.println(j+" ");
			}  
			 for (int k = 2; k <=2; k++) {
				System.out.println(k+" ");
			}
			 System.out.println("");
		}
		  
	  }
	  public void ilkElliAsalSayi() {
		  int count=0;
		  int  num=2;
		  while(count<50) {
			  boolean isPrime=true;
			  for (int i = 2; i <num; i++) {
				if (num%i==0) {
					isPrime=false;
				}
			}
			  if (isPrime) {
				count++;
				if (count%10==0) {
					System.out.println(num);
				}else {
					System.out.println(num+" ");
				}
			}
			  num++;
		  }
	  }
	}