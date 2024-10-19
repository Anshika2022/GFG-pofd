int n = str.length();
        String s = str;
        char[] arr = str.toCharArray();
        if (arr[n - 1] <= '5') {
            arr[n - 1] = '0';
            return new String(arr);
        } else {
            arr[n - 1] = '0';
            for (int i = n - 2; i >= 0; i--) {
                
                int temp =  arr[i]-'0';  //converting to integer
                temp += 1;
                
                
                if(temp!=10){
                    arr[i] = (char)(temp+'0');
                    return new String(arr);
                }
                
                arr[i] = '0';
                
            }
            s = '1'+ str;
        }

        return s;
    }
