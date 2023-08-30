package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }


    public void updateQuality() {
        for (Item item:items) {
            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
             item.sellIn--;

             if (item.name.equals("Aged Brie")){
                 increaseTheQuality(item);
             }else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")){
                 qualityOfBackstage(item);
             }else if (item.name.equals("Conjured Mana Cake")) {
                 decreaseTheQuality(item, 2);
             } else {
                 decreaseTheQuality(item);
             }

            }

        }
    }

    /**
     * Decrease the quality of an item. If the item is past its sell-by date, decrease the quality twice as fast.
     *
     * @param item The item whose quality is being decreased.
     * @param fall The amount by which to decrease the quality.
     */
    private void decreaseTheQuality(Item item,int fall) {
        for (int i = 0; i < fall; i++) {
            decreaseTheQuality(item);
        }
    }

    /**
     * Increase the quality of an item.
     *
     * @param item The item to increase the quality of.
     * @param rise The amount by which to increase the quality.
     */
    private void increaseTheQuality(Item item,int rise) {
        for (int i = 0; i < rise; i++) {
            increaseTheQuality(item);
        }
    }

    /**
     * Increase the quality of an item by one, but only if the quality is below 50.
     *
     * @param item The item to increase the quality of.
     */
    private void increaseTheQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    /**
     * Decreases the quality of an item. If the item is past its sell-by date, the quality decreases faster.
     *
     * @param item The item to decrease the quality of.
     */
    private void decreaseTheQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.quality--;
            }
        }
    }

    /**
     * Adjust the quality of a backstage pass item based on its sell-in value. If the sell-in is negative (i.e., the event
     * has passed), set the quality to 0. Otherwise, increase the quality: by 3 if sell-in is 5 days or less, by 2 if less
     * than 10 days, or by 1 otherwise.
     *
     * @param item The backstage pass item to adjust.
     */
    private void qualityOfBackstage(Item item) {
        if (item.sellIn < 0) {
            item.quality = 0;
        } else if (item.sellIn <= 5) {
            increaseTheQuality(item, 3);
        } else if (item.sellIn <= 10) {
            increaseTheQuality(item, 2);
        } else {
            increaseTheQuality(item);
        }
    }


    }
