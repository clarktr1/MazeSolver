import java.util.EmptyStackException;
public class MyStack implements StackADT{
private Square[] stack;
private int size;
public MyStack2() {
stack = new Square[16];
size = 0;
}
public MyStack2(int initCap) {
stack = new Square[initCap];
size = 0;
}
public boolean isEmpty() {
return size == 0;
}
public int size() {
return size;
}
public Square peek() {
if(isEmpty()) {
throw new EmptyStackException();
}
return stack[size -1];
}
public Square pop() {
if(size == 0) {
throw new EmptyStackException();
}
Square result = stack[size];
size--;
stack[size] = null;
return result;
}
public void push(Square item) {
if(size == stack.length) {
doubleCapacity();
}
stack[size] = item;
size++;
}
private void doubleCapacity() {
stack = new Square[stack.length * 2];
for(int x = 0; x < stack.length; x++) {
stack[x] = stack[x];
stack[x + stack.length] = stack[x];
}
}
public void clear() {
size = 0;
for(int x = 0; x < stack.length; x++) {
stack = null;
}
}
public String toString() {
if(isEmpty())
return "[]";
String s = "[";
for (int i = 0; i < size; i++) {
s += stack[i] + ", ";
}
return s.substring(0, s.length() - 2) + "]";
}
}