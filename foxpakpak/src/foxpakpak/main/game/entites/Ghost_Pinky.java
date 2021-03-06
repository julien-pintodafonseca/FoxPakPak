package foxpakpak.main.game.entites;

import foxpakpak.main.game.entites.Direction;
import static foxpakpak.main.game.entites.Direction.*;
import iut.Jeu;
import iut.Objet;

public class Ghost_Pinky extends Ghost {
    
    private int variableDeTravail = -1;
    private Direction directionsEnMemoire [] = {HAUT,null,null,null};
    private boolean prochainATraiter[] = {true,true,false,false};
    
    public Ghost_Pinky(Jeu _g, String _nom, int _x, int _y) {
        super(_g, _nom, _x, _y);
        this.timer = 0;
        this.elapsed = 0;
        this.dA = DROITE;
        this.vDir = true;
        this.dirTmp = DROITE;
        setDirection(HAUT);
        setVitesse(2);
        setSpawn(_x, _y);
        directionsEnMemoire[0]=HAUT;
    }
    
    @Override
    public void effetCollision(Objet o) {
        switch (o.getTypeObjet()) {
            case "MUR":              
                switch (getDirection()) {
                    case HAUT:
                        deplacerXY(0, vitesse);
                        if (!antiBoucle()){
                            if (this.variableDeTravail == 1){
                                setDirection(DROITE);
                                if (this.prochainATraiter[0] == true){
                                    directionsEnMemoire[0] = DROITE;
                                    prochainATraiter[0] = false;
                                    prochainATraiter[2] = true;
                                }else{
                                    directionsEnMemoire[2] = DROITE;
                                    prochainATraiter[0] = true;
                                    prochainATraiter[2] = false;
                                }
                            }
                            else {
                                setDirection(GAUCHE);
                                if (this.prochainATraiter[1] == true){
                                    directionsEnMemoire[1] = GAUCHE;
                                    prochainATraiter[1] = false;
                                    prochainATraiter[3] = true;
                                }else{
                                    directionsEnMemoire[3] = GAUCHE;
                                    prochainATraiter[1] = true;
                                    prochainATraiter[3] = false;
                                }
                            }
                        }else {
                            if (this.variableDeTravail == 1){
                                setDirection(BAS);
                                if (this.prochainATraiter[0] == true){
                                    directionsEnMemoire[0] = BAS;
                                    prochainATraiter[0] = false;
                                    prochainATraiter[2] = true;
                                }else{
                                    directionsEnMemoire[2] = BAS;
                                    prochainATraiter[0] = true;
                                    prochainATraiter[2] = false;
                                }
                            }
                            else {
                                setDirection(HAUT);
                                if (this.prochainATraiter[1] == true){
                                    directionsEnMemoire[1] = HAUT; //a voir si c'est gauche ou haut
                                    prochainATraiter[1] = false;
                                    prochainATraiter[3] = true;
                                }else{
                                    directionsEnMemoire[3] = HAUT;
                                    prochainATraiter[1] = true;
                                    prochainATraiter[3] = false;
                                }
                            }                            
                        } 
          
                        this.variableDeTravail = -1*this.variableDeTravail;  
                        break;

                    case BAS:
                        deplacerXY(0, -vitesse);
                        if (!antiBoucle()){
                            if (this.variableDeTravail == 1){
                                setDirection(DROITE);
                                if (this.prochainATraiter[0] == true){
                                    directionsEnMemoire[0] = DROITE;
                                    prochainATraiter[0] = false;
                                    prochainATraiter[2] = true;
                                }else{
                                    directionsEnMemoire[2] = DROITE;
                                    prochainATraiter[0] = true;
                                    prochainATraiter[2] = false;
                                }
                            }
                            else {
                                setDirection(GAUCHE);
                                if (this.prochainATraiter[1] == true){
                                    directionsEnMemoire[1] = GAUCHE;
                                    prochainATraiter[1] = false;
                                    prochainATraiter[3] = true;
                                }else{
                                    directionsEnMemoire[3] = GAUCHE;
                                    prochainATraiter[1] = true;
                                    prochainATraiter[3] = false;
                                }
                            }
                        }else {
                            if (this.variableDeTravail == 1){
                                setDirection(HAUT);
                                if (this.prochainATraiter[0] == true){
                                    directionsEnMemoire[0] = HAUT;
                                    prochainATraiter[0] = false;
                                    prochainATraiter[2] = true;
                                }else{
                                    directionsEnMemoire[2] = HAUT;
                                    prochainATraiter[0] = true;
                                    prochainATraiter[2] = false;
                                }
                            }
                            else {
                                setDirection(BAS);
                                if (this.prochainATraiter[1] == true){
                                    directionsEnMemoire[1] = BAS; //a voir si c'est gauche ou haut
                                    prochainATraiter[1] = false;
                                    prochainATraiter[3] = true;
                                }else{
                                    directionsEnMemoire[3] = BAS;
                                    prochainATraiter[1] = true;
                                    prochainATraiter[3] = false;
                                }
                            }                            
                        } 
          
                        this.variableDeTravail = -1*this.variableDeTravail;  
                        break;

                    case DROITE:
                        deplacerXY(-vitesse, 0);
                        if (!antiBoucle()){
                            if (this.variableDeTravail == 1){
                                setDirection(HAUT);
                                if (this.prochainATraiter[0] == true){
                                    directionsEnMemoire[0] = HAUT;
                                    prochainATraiter[0] = false;
                                    prochainATraiter[2] = true;
                                }else{
                                    directionsEnMemoire[2] = HAUT;
                                    prochainATraiter[0] = true;
                                    prochainATraiter[2] = false;
                                }
                            }
                            else {
                                setDirection(BAS);
                                if (this.prochainATraiter[1] == true){
                                    directionsEnMemoire[1] = BAS;
                                    prochainATraiter[1] = false;
                                    prochainATraiter[3] = true;
                                }else{
                                    directionsEnMemoire[3] = BAS;
                                    prochainATraiter[1] = true;
                                    prochainATraiter[3] = false;
                                }
                            }
                        }else {
                            if (this.variableDeTravail == 1){
                                setDirection(DROITE);
                                if (this.prochainATraiter[0] == true){
                                    directionsEnMemoire[0] = DROITE;
                                    prochainATraiter[0] = false;
                                    prochainATraiter[2] = true;
                                }else{
                                    directionsEnMemoire[2] = DROITE;
                                    prochainATraiter[0] = true;
                                    prochainATraiter[2] = false;
                                }
                            }
                            else {
                                setDirection(GAUCHE);
                                if (this.prochainATraiter[1] == true){
                                    directionsEnMemoire[1] = GAUCHE; //a voir si c'est gauche ou haut
                                    prochainATraiter[1] = false;
                                    prochainATraiter[3] = true;
                                }else{
                                    directionsEnMemoire[3] = GAUCHE;
                                    prochainATraiter[1] = true;
                                    prochainATraiter[3] = false;
                                }
                            }                            
                        }                            


                        this.variableDeTravail = -1*this.variableDeTravail;  
                        break;

                    case GAUCHE:
                        deplacerXY(vitesse, 0);
                        if (!antiBoucle()){
                            if (this.variableDeTravail == 1){
                                setDirection(HAUT);
                                if (this.prochainATraiter[0] == true){
                                    directionsEnMemoire[0] = HAUT;
                                    prochainATraiter[0] = false;
                                    prochainATraiter[2] = true;
                                }else{
                                    directionsEnMemoire[2] = HAUT;
                                    prochainATraiter[0] = true;
                                    prochainATraiter[2] = false;
                                }
                            }
                            else {
                                setDirection(BAS);
                                if (this.prochainATraiter[1] == true){
                                    directionsEnMemoire[1] = BAS;
                                    prochainATraiter[1] = false;
                                    prochainATraiter[3] = true;
                                }else{
                                    directionsEnMemoire[3] = BAS;
                                    prochainATraiter[1] = true;
                                    prochainATraiter[3] = false;
                                }
                            }
                        }else {
                            if (this.variableDeTravail == 1){
                                setDirection(GAUCHE);
                                if (this.prochainATraiter[0] == true){
                                    directionsEnMemoire[0] = GAUCHE;
                                    prochainATraiter[0] = false;
                                    prochainATraiter[2] = true;
                                }else{
                                    directionsEnMemoire[2] = GAUCHE;
                                    prochainATraiter[0] = true;
                                    prochainATraiter[2] = false;
                                }
                            }
                            else {
                                setDirection(DROITE);
                                if (this.prochainATraiter[1] == true){
                                    directionsEnMemoire[1] = DROITE; //a voir si c'est gauche ou haut
                                    prochainATraiter[1] = false;
                                    prochainATraiter[3] = true;
                                }else{
                                    directionsEnMemoire[3] = DROITE;
                                    prochainATraiter[1] = true;
                                    prochainATraiter[3] = false;
                                }
                            }                            
                        }                            


                        this.variableDeTravail = -1*this.variableDeTravail;  
                        break;
                }
                vDir = true;
                break;
        }
    }    
     
    @Override
    public void evoluer(long dt) {
        tSprite += dt;
        Boolean animation = tSprite > delaySprite+250;
        if (immunityState) {
            this.changeSprite("Sprites/Ghosts/Pinky");
        } else {  
            if (animation) {
                tSprite = delaySprite;
                selectedSprite = !selectedSprite;
            }
            if (selectedSprite) {
                this.changeSprite("Sprites/Ghosts/EdibleState_1");
            } else {
                this.changeSprite("Sprites/Ghosts/EdibleState_2");
            }
        }
        if (isReborn()){
            setDirection(HAUT);
            setReborn(false);
        }  
        if ((posDroite() <= 23) && (posBasse() >= 379) && (posBasse() <= 415)){
            this.deplacerXY(1000-posDroite(), 0);
        }
        
        if ((posDroite() >= 1031) && (posBasse() >= 379) && (posBasse() <= 415)){
            this.deplacerXY(23-posDroite(), 0);
        }        
        if (!collisionMur) {
            this.vitesse = 1;
            switch (getDirection()) {
                case HAUT:
                    deplacerXY(0, -vitesse);
                    break;

                case DROITE:
                    deplacerXY(vitesse, 0);
                    break;

                case BAS:
                    deplacerXY(0, vitesse);
                    break;

                case GAUCHE:
                    deplacerXY(-vitesse, 0);
                    break;
            }
        }
        collisionMur = false;
    }  
    
    
    public boolean antiBoucle(){
        boolean rep = false;
        if ((directionsEnMemoire[0] == null) || (directionsEnMemoire[1] == null) || (directionsEnMemoire[2] == null) || (directionsEnMemoire[3] == null)){
            rep = false;
        }else {
            if (directionsEnMemoire[0] == directionsEnMemoire[2]){
                if (directionsEnMemoire[1] == directionsEnMemoire[3]){
                    rep = true;
                }
            }
        }
        return rep;
    }

    @Override
    public String getTypeObjet() {
        return "GHOST_PINKY";
    }
    
}