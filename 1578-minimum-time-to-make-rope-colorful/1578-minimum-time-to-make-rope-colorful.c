int minCost(char* colors, int* neededTime, int neededTimeSize) {
    int res = 0,max=0;
    for(int i=0;i<neededTimeSize;i++){
        if(i>0 && colors[i]!=colors[i-1]){
            max=0;
        }
        if(neededTime[i]<max){
            res += neededTime[i];
        }
        else{
            res += max;
            max =neededTime[i];
        }
    }
    return res;
}