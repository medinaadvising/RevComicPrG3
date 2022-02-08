export class Transaction {

    constructor(
        public quantity:Number,
        public total:String,
        public f_name:String,
        public l_name:String,
        public credit_card:String,
        public expiration:string,
        public cvv:Number,
        public zipcode:Number
        ){}
}
