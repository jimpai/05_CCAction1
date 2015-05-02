package com.jimpai.ccaction1;

import org.cocos2d.actions.grid.CCDeccelAmplitude;
import org.cocos2d.actions.instant.CCFlipX;
import org.cocos2d.actions.instant.CCHide;
import org.cocos2d.actions.instant.CCShow;
import org.cocos2d.actions.interval.CCBlink;
import org.cocos2d.actions.interval.CCDelayTime;
import org.cocos2d.actions.interval.CCMoveTo;
import org.cocos2d.actions.interval.CCRotateTo;
import org.cocos2d.actions.interval.CCScaleTo;
import org.cocos2d.layers.CCLayer;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGPoint;

/**
 * Created by jimpai on 15/4/24.
 */
public class GameLayer extends CCLayer {

    CCSprite player;

    public GameLayer() {
        player = CCSprite.sprite("player.png");
        this.addChild(player);
        CGPoint point = CGPoint.ccp(100, 100);

        player.setPosition(point);

        CCFlipX flipX = CCFlipX.action(true);

        player.runAction(flipX);

        //CCHide ccHide = CCHide.action();
        //player.runAction(ccHide);

        CGPoint target = CGPoint.ccp(500, 500);
        CCMoveTo ccMoveTo = CCMoveTo.action(5, target);
        player.runAction(ccMoveTo);

        CCRotateTo ccRotateTo = CCRotateTo.action(5, 180);
        player.runAction(ccRotateTo);

        CCScaleTo ccScaleTo = CCScaleTo.action(5, 3, 3);
        player.runAction(ccScaleTo);

        CCBlink ccBlink = CCBlink.action(5, 50);
        player.runAction(ccBlink);
        //CCShow ccShow = CCShow.action();
        //player.runAction(ccShow);

    }
}
