#include<stdio.h>
#include<stdlib.h>

typedef struct Node{
    int val;
    struct Node * next;
}ListNode;
int countList(ListNode * head);
ListNode * reversList(ListNode * head);
ListNode * addtwoList(ListNode * l1, ListNode * l2);

ListNode * creatList(int *array,int size)
{
    ListNode *list=NULL;
    ListNode *head=NULL;
    ListNode *end=NULL;
    printf("list count = %d\n",size);
    if(size>0)
    {
        head = (ListNode*)malloc(sizeof(ListNode));
        head->val = array[0];
        end = head;
        for(int i=1;i<size;i++)
        {
            list = (ListNode*)malloc(sizeof(ListNode));
            list->val = array[i];
            end->next = list;
            end= end->next;
        }
        end->next=NULL;
    }
    return head;
}

ListNode* freeList(ListNode * head)
{
    ListNode * list = head;
    ListNode * temp = head;
    while(list!=NULL)
    {
            temp = list->next;
            free(list);
            list = temp;
    }
    return NULL;
}

void printList(ListNode * head)
{
    ListNode * list = head;
    int i = 0;
    if(list == NULL)
    {
        printf("this list is empty\n");
        return;
    }    
    while(list!=NULL)
    {
        printf("%d->%d\n",i++,list->val);
        if(list->next != NULL)
            list = list->next;
        else
        {
            break;
        }
        
    }
}

void main()
{
    int array[] = {99};
    int array2[] = {15,2};
    ListNode *l1 = creatList(array, sizeof(array) / sizeof(array[0]));
 //   printList(l1);
    ListNode *l2 = creatList(array2, sizeof(array2) / sizeof(array2[0]));
 //   printList(l2);
    ListNode *listsum = addtwoList(l2,l1);
    printList(listsum);
    freeList(l1);
    freeList(listsum);
    freeList(l2);
}

int countList(ListNode * head)
{
    int count = 0;
    ListNode *list = head;
    while(list!=NULL)
    {
        list = list->next;
        count++;
    }
    return count;
}

ListNode * reversList(ListNode * head)
{
    ListNode * newhead = NULL;
    ListNode * tail=newhead;
    ListNode * end;
    while(head->next != NULL)
    {
        end = head;
        while(end->next->next!=NULL)
        {
            end = end->next;
        }
        if(newhead == NULL)
        {
            newhead = end->next;
            tail = newhead;
            tail->next = NULL;
            end->next = NULL;
        }
        else
        {
            tail->next = end->next;
            tail = tail->next;
            tail->next = NULL;
            end->next = NULL;
        }
        
    }
    tail->next = head;
    return newhead;
}

ListNode * addtwoList(ListNode * l1, ListNode * l2)
{
    ListNode * ll1=l1;
    ListNode * ll2=l2;
    ListNode *head=NULL;
    ListNode *tail;
    ListNode *temp;
    ListNode *node;
    ListNode *joint;
    int carryin=0;
    int sum=0;
    while(ll1!=NULL && ll2!=NULL)
    {
        node = (ListNode*)malloc(sizeof(ListNode));
        if(head == NULL){head = node;tail = head ;}
        else{tail->next = node;tail = node ;}
        sum=carryin + ll1->val + ll2->val;
        carryin = sum/10;
        sum = sum%10;
        node->val = sum;
    //    printf("node->val=%d,sum=%d,carryin=%d\n",node->val,sum,carryin);

        ll1=ll1->next;
        ll2=ll2->next;
    }
    if(ll1 ==NULL && ll2 == NULL)
    {
        while(carryin!=0)
        {
            node = (ListNode*)malloc(sizeof(ListNode));
            node->val = carryin%10;
            carryin = carryin/10;
            tail->next = node;
            tail = node;
        }
        return head;
    }
    else if(ll1 == NULL)
    {
        temp = ll2;
    }
    else
    {
        temp = ll1;
    }
    while(temp!=NULL)
    {
        node = (ListNode*)malloc(sizeof(ListNode));
        sum = temp->val + carryin;
        carryin = sum/10;
        sum = sum%10;
        
        node->val = sum;
//        printf("joint->val=%d,sum=%d,carryin=%d\n",joint->val,sum,carryin);
        tail->next = node;
        tail = node;
        temp = temp->next;
    }
    while(carryin!=0)
    {
        node = (ListNode*)malloc(sizeof(ListNode));
//        printf("rest->val=%d,sum=%d,carryin=%d\n",joint->val,sum,carryin);
        node->val = carryin%10;
        carryin /= 10;
        tail->next = node;
        tail = node;
    }
    return head;
}