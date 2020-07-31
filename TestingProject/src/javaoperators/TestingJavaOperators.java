/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoperators;

/**
 *
 * @author servi
 */
public class TestingJavaOperators {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) { 
                int i,j,k,l=0;
	k = ++l; 
	j = ++k; 
	i = ++j; 
	System.out.println(k);
                System.out.println(j);
                System.out.println(i);
                
                int m, n , o, p = 0;
                o = p++;
                n = o++;
                m = n++;
                System.out.println(o);
                System.out.println(n);
                System.out.println(m);
        }
        
}
