package ProgrammingCreek;

import java.util.*;

public class WordLadder {
    public int ladderLength(String startingWord, String endingWord, Set<String> dictionary) {
        if (startingWord.isEmpty() || endingWord.isEmpty() || dictionary.isEmpty()) {
            return 0;
        }
        Queue<WordNode> queue = new LinkedList<>();
        WordNode lastWordAdded = null;
        dictionary.add(endingWord);
        queue.add(new WordNode(startingWord, 1));
        while (!queue.isEmpty()) {
            WordNode currentWord = queue.remove();
            char[] currentWordArray = currentWord.word.toCharArray();
            for (int i = 0; i < currentWordArray.length; i++) {
                for (char j = 'a'; j < 'z'; j++) {
                    char temp = currentWordArray[i];
                    if(currentWordArray[i] != j){
                        currentWordArray[i] = j;
                    }
                    String newWordFormed = new String(currentWordArray);
                    if(dictionary.contains(newWordFormed)){
                        lastWordAdded = new WordNode(newWordFormed,currentWord.numOfSteps+1);
                        queue.add(lastWordAdded);
                        dictionary.remove(newWordFormed);
                    }
                    currentWordArray[i] = temp;
                }
            }
        }

        return lastWordAdded.numOfSteps;
    }

    public static void main(String[] args) {
        String startString = "hit";
        String endString = "cog";
        Set<String> dictionary = new HashSet<>();
        dictionary.add("hot");
        dictionary.add("dot");
        dictionary.add("dog");
        dictionary.add("lot");
        dictionary.add("log");

        WordLadder wordLadderObj = new WordLadder();
        System.out.println(wordLadderObj.ladderLength(startString,endString,dictionary));
    }
}
