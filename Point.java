class Point implements Comparable<Point> {  
  int x;
  int y;
  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int compareTo(Point p) {
      if (this.x==p.x) return Integer.signum(this.y-p.y);
      return Integer.signum(this.x-p.x); 
  }
}
