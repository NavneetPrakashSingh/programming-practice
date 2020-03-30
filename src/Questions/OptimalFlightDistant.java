package Questions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class PairInt{
    int first, second;
    PairInt(){}
    PairInt(int first, int second){
        this.first = first;
        this.second = second;
    }
}

public class OptimalFlightDistant {


    public static void main(String[] args) {
        // sample input
//        System.out.println(getIdPairsForOptimal(
//                Arrays.asList(Arrays.asList(1, 3000), Arrays.asList(2, 5000), Arrays.asList(3, 7000),
//                        Arrays.asList(4, 10000)),
//                Arrays.asList(Arrays.asList(1, 2000), Arrays.asList(2, 9000), Arrays.asList(3, 5000)), 10000));
    }

    public static List<PairInt> getIdPairsForOptimal(List<PairInt> forwardRouteList,
                                                           List<PairInt> returnRouteList, int maxTravelDist) {
        List<PairInt> result = new LinkedList<PairInt>();
        forwardRouteList = forwardRouteList.stream().sorted((x1, x2) -> Integer.compare(x2.second, x1.second))
                .collect(Collectors.toList());
        returnRouteList = returnRouteList.stream().sorted((x1, x2) -> Integer.compare(x1.second, x2.second))
                .collect(Collectors.toList());
        int maxDist = maxTravelDist;
        while (true) {
            for (PairInt l : forwardRouteList) {
                for (PairInt b : returnRouteList) {
                    int forward = l.second;
                    int backward = b.second;
                    int tot = (forward + backward);
                    if (tot > maxDist) {
                        break;
                    }
                    if (tot == maxDist) {
                        // print the pair of Id and optimum distance
                        result.add(new PairInt(l.first, b.first));
                        break;
                    }

                }
            }
            if (result.size() > 0) {
                break;
            }
            maxDist--;
        }
        return result;
    }

}