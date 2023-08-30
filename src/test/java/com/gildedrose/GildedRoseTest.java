package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {



    @Test
    void testNormalItemQualityDecrease() {
        Item[] items = new Item[] { new Item("Normal Item", 5, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].quality);
    }

    @Test
    void testNormalItemQualityDecreaseAfterSellIn() {
        Item[] items = new Item[] { new Item("Normal Item", -1, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items[0].quality);
    }

    @Test
    void testAgedBrieQualityIncrease() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(11, app.items[0].quality);
    }

    @Test
    public void testFailingUpdateQuality() {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 30) };
        GildedRose app = new GildedRose(items);

        // Call updateQuality once
        app.updateQuality();

        // This assertion will fail because the quality of Aged Brie should increase, but we expect it to stay the same
        assertEquals(31, items[0].quality);
    }
    @Test
    void testAgedBrieQualityIncreaseAfterSellIn() {
        Item[] items = new Item[] { new Item("Aged Brie", -1, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(11, app.items[0].quality);
    }

    @Test
    void testBackstagePassQualityIncrease() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(11, app.items[0].quality);
    }

    @Test
    void testBackstagePassQualityIncreaseMore() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(13, app.items[0].quality);
    }

    @Test
    void testBackstagePassQualityZeroAfterSellIn() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void testConjuredItemQualityDecrease() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 5, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items[0].quality);
    }
}
