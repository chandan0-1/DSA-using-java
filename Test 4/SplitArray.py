def helper(arr, n, start, lsum, rsum): 
  

    if (start == n): 
        return lsum == rsum 
  

    if (arr[start] % 5 == 0): 
        lsum += arr[start] 

    elif (arr[start] % 3 == 0): 
        rsum += arr[start] 
  

    else: 

        return (helper(arr, n, start + 1,  
                lsum + arr[start], rsum) or
                helper(arr, n, start + 1,  
                lsum, rsum + arr[start])); 

    return helper(arr, n, start + 1, lsum, rsum) 

def splitArray(arr, n): 

    return helper(arr, n, 0, 0, 0) 
  
 
if __name__ == "__main__": 
    n=int(input())
    arr = [ int(x) for x in input().split()] 

  
    if (splitArray(arr, n)): 
        print("true") 
    else: 
        print("false") 
