package ödev2_part1;

public class Route implements Comparable<Route>{
    private static String[] places = new String[]{
            "Ankara",
            "Istanbul",
            "Antalya",
            "Izmir"
    }; //objects will be creating from according to these!

    public String source;
    public String dest;


    public Route(String s, String d){ //firstly ,defining the constructor
        this.source = s;
        this.dest = d; //assign the source and dest
    }

    public int compareTo(Route r){ //compareTo method returns an int value
        //this method looking for that condition : the sources of objecs are same or not??
        //if their sources are same then they are ordered with respect to their destinations!!
        if(this.source.compareTo(r.source) == 0){// same?
            return this.dest.compareTo(r.dest);
        }
        else{//not same?
            return this.source.compareTo(r.source);
        }
    }


    private static int partition(Route[] array, int begin, int end){

        int back = begin-1;
        int front = begin;
        Route pivot = array[end];

        while(front < end){

            if(array[front].compareTo(pivot) > 0){
                back++;
                Route temp = array[front];
                array[front] = array[back]; //exchanges the indexes and the values
                array[back] = temp;
            }

            front++; //increases one the value of front
        }

        back++; //increases one the value of back after the loop

        Route temp = array[front]; //for exchange create a temporary route
        array[front] = array[back]; //exchanges the indexes and the values
        array[back] = temp;
        return back;
    }



    public static void sort(Route[] array, int begin, int end){
        //for sorting

        if(end <= begin){
            return;
        }
        int mid = partition(array,begin,end); //calling the partion method

        sort(array, mid+1, end);
        sort(array,begin, mid-1);
    }

    
    public static void sort(Route[] array){
        sort(array, 0,array.length-1);
    }



  /*  public static Route getRandomRoute(){ //creating random route
        int indexs = (int)(Math.random() * (places.length-1));
        int indexe = 0;

        while(indexs == indexe){
            indexe = (int)(Math.random() * (places.length-1));

        }
        return new Route(places[indexs], places[indexe]); //return a new Route
    }
*/
    

    public String toString(){
        return this.source + " " + this.dest;
    } //returns a string

    public static void show(Route[] a)
    { // Print the array, on a single line.
        for (int i = 0; i < a.length; i++){ //for loop works as the length of the array times
            System.out.println(a[i] + " ");}
        System.out.println();
    }


}