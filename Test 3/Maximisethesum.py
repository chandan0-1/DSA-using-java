def fun(arr1,n1,arr2,n2):
    i=0
    j=0
    max_sum=0
    s1=0
    s2=0
    v=set(arr1).intersection(set(arr2))
    if len(v)==0:
        return max(sum(arr1),sum(arr2))
    while i<n1 and j<n2:
        if arr1[i]==arr2[j]:
            max_sum+= s1 if s1 >s2 else s2
            max_sum+=arr1[i]
            i+=1
            j+=1
            # max_sum+=max(s1,s2)
            s1=0
            s2=0
        # else:
            
        elif arr1[i]<arr2[j]:
            s1+=arr1[i]
            i+=1
        elif arr1[i]>arr2[j]:
            s2+=arr2[j]
            j+=1
            # else:
            #     max_sum+=max(s1,s2)
    # max_sum+=max(s1,s2)
    while i<n1:
        s1+=arr1[i]
        i+=1
    while j<n2:
        s2+=arr2[j]
        j+=1
    max_sum+=max(s1,s2)
    return max_sum

n1=int(input())
arr1=[int(x) for x in input().split()]
n2=int(input())
arr2=[int(x) for x in input().split()]
print(fun(arr1,n1,arr2,n2))
