import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Maze {
private Square start;
private Square exit;
private int row;
private int col;
private Square[][] maze;
public Maze() {
loadMaze("maze-2 (1)");
}
public boolean loadMaze(String fileName) {
File file = new File(fileName);
Scanner fileReader;
try {
fileReader = new Scanner(file);
} catch(FileNotFoundException e) {
return false;
}
row = fileReader.nextInt();
col = fileReader.nextInt();
maze = new Square[row][col];
for(int x1 = 0; x1 < row; x1++) {
for(int x2 = 0; x2 < col; x2++) {
int x = fileReader.nextInt();
Square square = new Square(x1, x2, x);
maze[x1][x2] = square;
if(square.getType() == square.START) {
start = maze[x1][x2];
}
if(square.getType() == square.EXIT) {
exit = maze[x1][x2];
}
}
}
return true;
}
public boolean isInGrid(int r1, int c1) {
return (r1 < maze.length && r1 >= 0) && (c1 < maze[0].length && c1 >=
0);
}
public List<Square> getNeighbors(Square s){
int[] dx = {-1, 0, 1, 0};
int[] dy = {0, 1, 0, -1};
List<Square> result = new ArrayList<>();
for(int i = 0; i < dy.length; i++) {
if(isInGrid(s.getRow() + dx[i], s.getCol() + dy[i])) {
result.add(maze[s.getRow() + dx[i]][s.getCol() + dy[i]]);
}
}
return result;
}
public Square getStart() {
return start;
}
public Square getExit() {
return exit;
}
public void reset() {
for(int x1 = 0; x1 < row; x1++) {
for(int x2 = 0; x2 < col; x2++) {
maze[x1][x2].reset();
}
}
}
public String toString() {
String result = "";
for(int x1 = 0; x1 < row; x1++) {
for(int x2 = 0; x2 < col; x2++) {
result += maze[x1][x2].getStatus();
}
result += "\n";
}
return result;
}
}