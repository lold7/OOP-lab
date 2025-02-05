public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    
    public ComparableCircle(double radius){
       super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o){
        if(this.getRadius() > o.getRadius()){
            return 1;
        }
        else if(this.getRadius() < o.getRadius()){
            return -1;
        }
        else{
            return 0;
        }
    }
  
    

}

