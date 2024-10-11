int n=arr.size();
        vector<int>temp(n,-1);
        for(int i=0;i<n;i++){
            if(arr[i]==-1){
                continue;
            }
            else{
                temp[arr[i]]=arr[i];
            }
        }
        return temp;
