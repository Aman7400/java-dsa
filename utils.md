# print an array as ans

````java
 int ans[] = getFloorAndCeil(new int[] { 2, 4, 6, 8, 10, 12, 14 }, 1);

        for (int i : ans) {
            System.out.println(i);
        }

        System.out.println();
````

# pass arraylist as input 

````java
int arr[] = new int[] { 3, 1, 2, 3, 3, 3, 3 };

 ArrayList<Integer> nums = new ArrayList<>();
        for (int num : arr) {
            nums.add(num);
        }

        System.out.println(searchArry(nums, 3));
````