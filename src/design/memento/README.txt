Memento pattern is designed for  supports undo mechanism
----We are hab=ving a editor state class which is responsible for storing state of Editor at any time
----if we keep EditorStte inside editor class it will be violating SOLID principles
----We will intorduce History clss which is used for state management
----Editor class -> Originator
----EditorState --> Memento
----History class--> Care Taker