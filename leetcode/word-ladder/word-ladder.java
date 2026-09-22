class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int level =1;
        if(beginWord=="")return 0;

        Set<String> set = new HashSet<>();
        for(String s : wordList){
            set.add(s);
        }
        if(!set.contains(endWord))return 0;

        while(!q.isEmpty()){
            level++;
            int size = q.size();

            for(int s=0; s<size; s++){
                String curr = q.poll();
                char[] charr = curr.toCharArray();

                for(int i=0; i<curr.length(); i++){
                    for(char ch='a'; ch<='z'; ch++){ 
                        char ogch = charr[i];
                        charr[i] = ch;
                        
                        String newWord = new String(charr);
                        if((newWord).equals(endWord)) return level;
                        if(set.contains(newWord)){
                            q.add(newWord);
                            set.remove(newWord);
                        }

                        charr[i]=ogch;
                    }

                }
            }            
        }

        return 0;
    }
}

//bfs, so take input as start word
// for every letter in startword replace a-z  --> add those to the level
//if current q contains endword then that is the shortest paath. since it means its first time u reached 