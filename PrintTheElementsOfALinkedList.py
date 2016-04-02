def print_list(head):
    if head != None:
        print(head.data)
        print_list(head.next)
