class Farm 
{     
   private Animal[] alotOfAnimals = new Animal[3];
   public Farm() {
   alotOfAnimals[0] = new NamedCow("cow","jessie","moo");
   alotOfAnimals[1] = new Chick("chick","cluck");
   alotOfAnimals[2] = new Pig("pig","oink");
   }
   public void AnimalSounds(){
     for(int i = 0 ; i < alotOfAnimals.length ; i++){
      System.out.println( alotOfAnimals[i].getType() + " goes " + alotOfAnimals[i].getSound() );       }       
      System.out.println( "The cow is known as " + ((NamedCow)alotOfAnimals[0]).getName() );    
       
     }
   }
