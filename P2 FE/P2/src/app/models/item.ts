export class Item {

    constructor(
        public item_id:object,
        public image:Object,
        public title:String,
        public description:String,
        public comic_link:String,
        public year_published:Number,
        public price:Number,
        public qty_at_seller:Number,
        public creator_id:Number,
        public genre_id:Number,
        public character_id:Number,
        public promo_type_id:Number,
        ){}
}
