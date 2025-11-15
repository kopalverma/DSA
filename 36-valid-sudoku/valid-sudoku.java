class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character , Integer> map=new HashMap<>();
        map.put('1' ,1);
        map.put('2' ,1);
        map.put('3' ,1);
        map.put('4' ,1);
        map.put('5' ,1);
        map.put('6' ,1);
        map.put('7' ,1);
        map.put('8' ,1);
        map.put('9' ,1);
        map.put('.',1);
        for(int i=0 ; i<9 ; i++){
            for(int j=0 ; j<9 ; j++){
                if(map.containsKey(board[i][j])){
                    map.put(board[i][j] , map.get(board[i][j])+1);
                }
                if(map.get(board[i][j])>2 && board[i][j]!='.'){
                    return false;
                }
            }
            map.put('1' ,1);
            map.put('2' ,1);
            map.put('3' ,1);
            map.put('4' ,1);
            map.put('5' ,1);
            map.put('6' ,1);
            map.put('7' ,1);
            map.put('8' ,1);
            map.put('9' ,1);
            map.put('.' ,1);
        }
        
        for(int i=0 ; i<9 ; i++){
            for(int j=0 ; j<9 ; j++){
                if(map.containsKey(board[j][i])){
                    map.put(board[j][i] , map.get(board[j][i])+1);
                }
                if(map.get(board[j][i])>2 && board[j][i]!='.'){
                    return false;
                }
            }
            map.put('1' ,1);
            map.put('2' ,1);
            map.put('3' ,1);
            map.put('4' ,1);
            map.put('5' ,1);
            map.put('6' ,1);
            map.put('7' ,1);
            map.put('8' ,1);
            map.put('9' ,1);
        }
        
        for(int i =0 ; i<9 ; i =i+3){
            for(int l=0 ; l<9 ;l=l+3){
                for(int j=0 ; j<3 ; j++){
                    for(int k=0 ; k<3 ; k++){
                        if(map.containsKey(board[i+j][l+k])){
                            map.put(board[i+j][l+k] , map.get(board[j+i][l+k])+1);
                        }
                        if(map.get(board[j+i][l+k])>2 && board[j+i][l+k]!='.'){
                            return false;
                        }
                    }
                    
                }
                map.put('1' ,1);
                map.put('2' ,1);
                map.put('3' ,1);
                map.put('4' ,1);
                map.put('5' ,1);
                map.put('6' ,1);
                map.put('7' ,1);
                map.put('8' ,1);
                map.put('9' ,1);
            }
            
        }
        
        return true;
    }
}