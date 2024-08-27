// Array print through loop :

// public class ArrayPrint {
// public static void main(String[] args) {
// int a[] = { 1, 2, 3, 4, 6, 78 };
// // find size : length method
// System.out.println("size " + a.length);
// // using loop
// for (int i = 0; i < a.length; i++) {
// System.out.print(a[i] + " ");
// }
// }
// }
// -----------------------------------------
// want to print array element through for each loop

// syntax:

// for(datatype variable :arrayvariablename){

// sout(variable);

// }
// public class ArrayPrint {
// public static void main(String[] args) {
// int a[] = { 1, 2, 3, 4, 6, 78 };
// // find size : length method
// System.out.println("size " + a.length);
// // using for each loop for print all array elements
// for (int i : a) {
// System.out.print(i + " ");
// }
// }
// }
// ----------------------------------------------------------
// dynamic array :
// import java.util.*;
// public class ArrayPrint {
// public static void main(String[] args) {
// int a[] = new int[5];
// // data store
// a[4] = 92;
// a[2] = 45;
// System.out.println(a[4] + " " + a[2]);
// System.out.println();
// for(int i:a){
// System.out.print(i+" ");
// }
// }
// }
// -------------------------------------------------------------
// user input :
// import java.util.*;
// public class ArrayPrint {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the size of the array");
// int size = sc.nextInt();
// // dynamic array create
// int a[] = new int[size];
// // first for input the elements inside the array
// for (int i = 0; i < a.length; i++) {
// System.out.print("enter the value ");
// a[i] = sc.nextInt();
// }
// // second loop for the print array elements
// for (int i = 0; i < size; i++) {
// System.out.print(a[i] + " ");
// }
// }
// }
// ----------------------------------------------------------------
// ellapse :
// class A {
// void show(int... a) {
// for (int i : a) {
// System.out.print(i + " ");
// }
// }
// }

// public class ArrayPrint {
// public static void main(String[] args) {
// A p = new A();
// p.show(1, 2, 3, 5, 6);
// }
// }
// ----------------------------------------------------------------
// class A {
// void show(int x,int... a) {
// System.out.println(x);
// for (int i : a) {
// System.out.print(i + " ");
// }
// }
// }

// public class ArrayPrint {
// public static void main(String[] args) {
// A p = new A();
// p.show(1, 2, 3, 5, 6);
// }
// }

// class A {
// void show(int x,int... a) {
// System.out.println(x);
// for (int i : a) {
// System.out.print(i + " ");
// }
// }
// }

// public class ArrayPrint {
// public static void main(String[] args) {
// A p = new A();
// p.show(1, 2, 3, 5, 6);
// }
// }
