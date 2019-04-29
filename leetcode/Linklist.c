#include<stdio.h>
#include<stdlib.h>

typedef struct Node{
    int val;
    struct Node * next;
}ListNode;
int countList(ListNode * head);

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
    int array[5] = {10, 11, 12, 11, 13};
    ListNode *l2 = creatList(array, sizeof(array) / sizeof(array[0]));
    printList(l2);
    printf("total count of this list is %d\n",countList(l2));
    l2 = reversList(l2);
    printList(l2);
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
    return newhead;
}
