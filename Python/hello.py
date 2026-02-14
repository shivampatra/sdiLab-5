# # print("hello Python")
# # a = 4.9
# # # print(id(a))


# # # name="Rahul";
# # # del name              ;
# # # # print(id(name))          

# # # name="Saurabh"
# # # print(id(name))



# # # var1="Hello Python"

# # # print(var1[2:5])    

# # # print(var1.upper())



# # ##CHECK PALINDROME OR NOT

# # # a = input("Enetr the number : ")

# # # b=a[::-1]                                                                # sequence[start : end : step]


# # # if a==b:
# # #     print("Palindrome .")    
    
# # #                                               # [::-1] here satrt,end,go backwards
                                                                            
# # # else:
# # #     print("Not Palindrame")



# # # l = ["a",12,'s']
# # # print(l)

# # # a = "abc"

# # # a=list(a)

# # # print(a)


# # # a=[3]*12
# # # a=[56,89,67]*2
# # # a=["hello"]*3


# # # print(a)


# # # a=[10,23,44,55]
# # # print(a[0])
# # # print(a[-1])
# # # print(a[1:4])
# # # print(a[::-1])
# # # # print(a[1::2])
# # # print(a[0:5:1])


# # # append(): Adds an element at the end of the list.
# # # extend(): Adds multiple elements to the end of the list.
# # # insert(): Adds an element at a specific position.
# # # clear(): removes all items.

# # # a=[]

# # # a.append(12)
# # # a.extend([12,23,33  ])
# # # print(a)


# # # n = input("Enter a number : ")

# # # n=list(n)

# # # print(len(n))

# # # empid={1001,1002,1004,1003,1001,"apple","radha","Radha"}
# # # print(empid)



# # # s=set("Hello")
# # # print(s)

# # # s=set("Geeks for Geeks")
# # # s.add("SQL")
# # # s.update("SQL")
# # # print(s)




# # # s=set()

# # s={1,23,4,4,"s",5,5}
# # # s.add("hello")
# # # s.clear()
# # # l={1,23,2,3,2}
# # # # s=l.copy()
# # # s=l
# # # print(s)


# # s=list(s)

# # print(s[1])





# # s=set(["hello","world","java"])                                #SET
# # s={"hello","world","java"}                                    #SET
# # s=("hello","world","java")                                      #TUPLE
# # s=["hello","world","java"]                                     #list

# # s=list["hello","world","java"]                                  #<class 'types.GenericAlias'>
# # s=list["hello","world","java"]                                  #<class 'types.GenericAlias'>


# # print(type(s))



dict1 = {"A":"Apple","B":"Ball","C":"Choreography","D":"Dilwale"}


# print(dict1["D"])
# print(dict1.get("A"))

# # # if "A" in dict.get("A"):
# # if "A" in dict.keys():
# #     print(dict["A"])
# # else:
# #     print("Not available")


# if dict1.get("Age") != None:
#     print(dict1["Age"])
# else:
#     print("Not available")

# # dict.pop("A")
# # del dict["A"]

# del dict1
# print(dict1)


# for k,v in dict1.items():                                  #both key and values
#     print(k,":",v)


# for v in dict1.values():                                #only values
#     print(v)

# for k in dict1:                                       #only key values
#     print(k)

# def myFunction(a,b):
#     return a+b;

# print("Total=",myFunction(1,2))


                                            # CALL BY VALUE : SENDING THE PHOTO COPY
                                            #  AND CALL BY OBJECT REFERENCES : SEND THE ORIGINAL COPY , so anything change will affect the original one

# #call by value

# def myFunction(a):
#     a+=1
#     print(id(a))
#     return a;

# a=2
# print(myFunction(a))
# print(id(a))



#call by object reference

# def myFunction(a):
#     a.append(3)
#     print(id(a))
#     return a

# a=[12,33,12,33]
# print(myFunction(a))
# print(id(a))
# print(a)



# import math

# print(math.sqrt(25))
# print(math.pi)

# print(math.floor(10.45))    #just minimum int value   10
# print(math.ceil(23.44))     #just max value           24





# try:
#     num1=int(input("ENter no 1 : "))
#     num2=int(input("ENter no 2 : "))
#     print(num1/num2)

# except ZeroDivisionError:
#     print()
# except ValueError:
#     print()

# finally:
#     print("Finally executed")





# class Employee:
#  name="Raghav"
 
#  def getName(self):
#         return self.name
 
# e=Employee()
# print("Name : ",e.getName())


class Employee:
    def __init__(self,name,age):
        self.name=name
        self.age=age
        print("Cons....")
    def printEmployee(self):
        print("Name",self.name)
        print("Age",self.age)

e=Employee("Raj",34)
e.printEmployee()

        


 
 
e=Employee()
print("Name : ",e.getName())