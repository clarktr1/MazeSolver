public class MazeSolverWithStack extends MazeSolver {
private MyStack2 stack = new MyStack2();
public MazeSolverWithStack(Maze maze) {
super(maze);
add(maze.getStart());
}
public void makeEmpty() {
stack.clear();
}
public boolean isEmpty() {
return stack.size() == 0;
}
public void add(Square s) {
stack.push(s);
System.out.println("Stack = " + stack);
}
@Override
public Square next() {
return stack.pop();
}
}
