����   A a
      java/lang/Object <init> ()V	  	 
   java/lang/System out Ljava/io/PrintStream;  enter your name :
      java/io/PrintStream println (Ljava/lang/String;)V  java/util/Scanner	     in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     ! nextLine ()Ljava/lang/String; # enter your roll number :
  % &  close ( java/io/File * list of names.txt
 ' ,  
  .  / (Ljava/io/File;)V 1 ,
 3 4 5 6 7 java/lang/String split '(Ljava/lang/String;)[Ljava/lang/String;
 3 9 : ; equals (Ljava/lang/Object;)Z = Data is registered   ? @ A makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String; C no data found E java/lang/Exception G error occured I Students Code LineNumberTable Student_login StackMapTable O [Ljava/lang/String; 
SourceFile project.java BootstrapMethods T 	Welcome  V
 W X Y @ Z $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses ] %java/lang/invoke/MethodHandles$Lookup _ java/lang/invoke/MethodHandles Lookup   H            J        *� �    K          L   J  U     �� � � Y� � L+� M� "� +� N+� $� 'Y)� +:� Y� -:� :0� 2::�6	6

	� 8
2:,� 8� � <� � ,� >  � � � B� �
��ǧ L� F� �    � � D  K   V    	  
        %  )  4  ?  F  O  i  r  z  �  �  �  � ' � % � & � ) M   ; � [  H  3 3 '  3 N N  � - 3�   H  B D  P    Q R     U  S [   
  \ ^ ` 