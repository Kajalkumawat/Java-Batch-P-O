// interface
// class
// method

// access :

// interface A {
// class C {
// void show() {
// System.out.println("C class with interface A ");
// }
// }
// }

// class B extends A.C {
// void show1() {
// System.out.println("B class method ");
// }
// }

// public class Main1 {
// public static void main(String[] args) {
// B p = new B();
// p.show1();
// p.show();
// }
// }
// -------------------------------------------------------------------
// class
// interface
// method

// class A {
// interface B {
// int show(int a);
// }
// }

// class C implements A.B {
// public int show(int a) {
// System.out.println("Interface methods");
// return a;
// }
// }

// public class Main1 {
// public static void main(String[] args) {
// C p = new C();
// p.show(56);
// }
// }

// -------------------------------------------------------------------
// class
// class
// method1

// class A {
// class B {
// void show1() {
// System.out.println("Hello WOrld");
// }
// }
// }
// public class Main1 {
// public static void main(String[] args) {
// A p=new A();
// A.B k=p.new B();
// k.show1();
// }
// }
// -----------------------------------------------------------------
// interface as a anonymous inner class :

// anonymous inner class :abstract and interface

// interface A {
// void show();
// }

// public class Main1 {
// public static void main(String[] args) {
// A p = new A() {
// public void show() {
// System.out.println("hello WOrld ");
// }
// };
// p.show();
// }
// }
// -----------------------------------------------------
// //class-->interface and single class implement and extends both not possibler
// class A {
// void show1() {
// System.out.println("A class");
// }
// }

// interface B {
// void show2();
// }

// class C implements B extends A{
// public void show2(){
// System.out.println("interface");
// }
// }

// public class Main1 {
// public static void main(String[] args) {
// C k=new C();
// k.show2();
// }
// }
// -----------------------------------------------------
// //class-->interface and single class extends and implement both not possibler
// interface B {
// void show2();
// }

// class A {
// void show1() {
// System.out.println("A class");
// }
// }

// class C extends A implements B {
// public void show2() {
// System.out.println("interface");
// }
// }

// public class Main1 {
// public static void main(String[] args) {
// C k = new C();
// k.show2();
// }
// }
// ------------------------------------------------------------
